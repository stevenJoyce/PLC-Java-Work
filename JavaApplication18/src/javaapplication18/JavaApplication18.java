
package javaapplication18;
import java.io.*;
import java.util.*;
public class JavaApplication18 {

    public static void main(String[] args) throws FileNotFoundException{
  		  

    {
		// Constants - File objects - Record Layout - Other Variables
		final double RACE_MINI = 20.00, RACE_SPORT = 25.00, RACE_FULL = 30.00;
		final int NO_OF_RACES = 4;
		final double EARLY_BIRD = 0.10;

		int compId, i;
		char compClub, compRaceType, compEarlyDisc;
		String compFirstName, compLastName, compClubName = " ", compFullName,compRace = "";
		double compRaceTime, compAverage;

		Scanner inRaceDetailsFile = new Scanner(new FileReader("RaceDetails.dat"));
		PrintWriter outRaceRep = new PrintWriter("RaceDetailsRep.dat");
		PrintWriter outErrorRep = new PrintWriter("NotCompetingRep.dat");
		PrintWriter outEarlyBirdsFile = new PrintWriter("EarlyBirds.dat");

		// Initialise variables
		int clubCountGalway = 0, clubCountEnnis = 0, clubCountWestport = 0, clubCountSligo = 0;
		int miniRaceCount= 0, sportRaceCount=0, fullRaceCount=0, competing=0, notCompeting = 0;

		String firstPlaceFirstName=" ",firstPlaceLastName=" ", lastPlaceFirstName=" ",lastPlaceLastName=" ", firstPlaceRaceType = " ", lastPlaceRaceType=" ";
		double countRaceTime=0, averageRaceTime = 0, averageCount = 0, totalRaceTime = 0 ,raceCost=0;

		double quickRace = 0, slowRace = 999;

		// Screen / Report Headers
		System.out.println("Steven Joyce - Pre-Lab Exam 2 (December 2017)");
		outRaceRep.println("Steven Joyce - Pre-Lab Exam 2 (December 2017)");
		System.out.println(" ID  Competitor \t Club \tType EB      R1      R2     R3     R4 \t  Avg \t Cost" );
		outRaceRep.println(" ID  Competitor \t Club \tType EB      R1      R2     R3     R4 \t  Avg \t Cost" );
		System.out.println("==============================================================================");
		outRaceRep.println("==============================================================================");
		// while file Input until EOF
		while (inRaceDetailsFile.hasNext())
		{
			compId = inRaceDetailsFile.nextInt();
			compClub = inRaceDetailsFile.next().charAt(0);
			compFirstName = inRaceDetailsFile.next();
			compLastName = inRaceDetailsFile.next();
			compRaceType = inRaceDetailsFile.next().charAt(0);
			compEarlyDisc = inRaceDetailsFile.next().charAt(0);

			compFullName= compFirstName + " , " + compLastName;

			if(compClub == 'n' || compClub == 'N')
			{
				++notCompeting;
				inRaceDetailsFile.nextLine();

				//Output for Not Competing file
				outErrorRep.printf("%4d %-12s %-2c &-2c &-15s %n",compId, compFullName, compClub, compRaceType, compEarlyDisc, "-Not Competing");
			}
			else
			{
				++competing;

			switch (compClub)
					{
						case 'G':
						case 'g':
							compClubName = "Galway";
							++clubCountGalway;
							break;

						case 'E':
						case 'e':
							compClubName = "Ennis";
							++clubCountEnnis;
							break;
						case 'W':
						case 'w':
							compClubName = "Westport";
							++clubCountWestport;
							break;
						case 'S':
						case 's':
							compClubName = "Sligo";
							++clubCountSligo;
							break;

					} // switch



				if(compRaceType == 'M' || compRaceType == 'm')
				{
					compRace="Mini";
					raceCost=RACE_MINI;
					++miniRaceCount;
				}
				else if(compRaceType == 's' || compRaceType == 'S')
				{
					compRace="Sport";
					raceCost=RACE_SPORT;
					++sportRaceCount;
				}
				else if(compRaceType == 'F' || compRaceType == 'f')
				{
					compRace="Full";
					raceCost=RACE_FULL;
					++fullRaceCount;
				}
				else
				{
					compRace="Invalid";
					raceCost=0.00;
				}//if else

			System.out.printf("%4d %13s %9s %6s %2c ",compId, compFullName, compClubName, compRace, compEarlyDisc);
			outRaceRep.printf("%4d %13s %9s %6s %2c ",compId, compFullName, compClubName, compRace, compEarlyDisc);

				for(i=1; i <= NO_OF_RACES; i++)
				{
					compRaceTime = inRaceDetailsFile.nextDouble();
					System.out.printf(" %6.1f ",compRaceTime);
					outRaceRep.printf(" %6.1f ",compRaceTime);
					countRaceTime += compRaceTime;
					++averageCount;
					//Highest/Lowest
					if(compRaceTime < slowRace)
					{
						slowRace = compRaceTime;
						lastPlaceFirstName = compFirstName;
						lastPlaceLastName = compLastName;
						lastPlaceRaceType = compRace;
					}//if
					if(compRaceTime > quickRace )
					{
						quickRace = compRaceTime;
						firstPlaceFirstName= compFirstName;
						firstPlaceLastName= compLastName;
						firstPlaceRaceType = compRace;
					}//if
				}//for

				//Calculate Average
				averageRaceTime=countRaceTime/averageCount;
				totalRaceTime = raceCost * NO_OF_RACES;

				if(compEarlyDisc == 'Y' || compEarlyDisc == 'y')
				{
					totalRaceTime = totalRaceTime -(totalRaceTime * EARLY_BIRD);
					//Output to Early Bird file
					outEarlyBirdsFile.printf("%4d %-12s %-8s %-6s %n", compId, compFullName, compClubName, compRace);
				}
				else
				{
					totalRaceTime = totalRaceTime;
				}



		// Line Output
		System.out.printf(" %6.1f %6.2f %n",averageRaceTime, totalRaceTime);
		outRaceRep.printf(" %6.1f %6.2f %n",averageRaceTime, totalRaceTime);



		}//if else notCompete

		//Re-Inititialize
		totalRaceTime = 0;


	}//While
		// Output Screen / Report Footers
		System.out.println();
		outRaceRep.println();
		System.out.println("Competitor Counts:");
		outRaceRep.println("Competitor Counts:");
		System.out.println();
		outRaceRep.println();
		System.out.println("Competing: " + competing + " Not Competing: " +  notCompeting);
		outRaceRep.println("Competing: " + competing + " Not Competing: " +  notCompeting);
		System.out.println("Clubs: Galway: " + clubCountGalway + " Ennis: "+ clubCountEnnis + " Westport: "+ clubCountWestport + " Sligo: " + clubCountSligo);
		outRaceRep.println();
		System.out.println("Mini Race: " + miniRaceCount + " Sport Race: " + sportRaceCount + " Full race: " + fullRaceCount);
		outRaceRep.println("Clubs: Galway: " + clubCountGalway + " Ennis: "+ clubCountEnnis + " Westport: "+ clubCountWestport + " Sligo: " + clubCountSligo);
		System.out.println();
		System.out.println("The first competitor over the line was " + firstPlaceLastName + " , " + firstPlaceFirstName + " in the " + firstPlaceRaceType + " in " + quickRace);
		System.out.println("The last competitor over the line was " + lastPlaceLastName + " , " + lastPlaceFirstName + " in the " + lastPlaceRaceType + " in " + slowRace);
		// Close Files
		inRaceDetailsFile.close();
		outRaceRep.close();
		outErrorRep.close();
		outEarlyBirdsFile.close();
    }  // main

} // class
    }
    

