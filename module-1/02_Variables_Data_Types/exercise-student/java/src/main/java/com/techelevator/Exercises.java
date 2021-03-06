package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numRaccoons = 3;
		int numRaccoonsWentToDinner = 2;
		int racoonsLeft = numRaccoons - numRaccoonsWentToDinner;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int flowers = 5;
		int bees = 3;
		int difference = flowers - bees;



        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int bird = 1;
		int birdTwo = 1;
		int total = bird + birdTwo;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int threeOwls = 3;
		int twoOwls = 2;
		int totalOwls= threeOwls + twoOwls;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaverTwo = 2;
		int beaverOne = 1;
		int beaverTotal = beaverTwo - beaverOne;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucanTwo = 2;
		int toucanOne = 1;
		int toucansTotal = toucanTwo + toucanOne;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int fourNut = 4;
		int twoNut = 2;
		int nutDiff = fourNut - twoNut;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double oneDime = .10;
		double oneQuarter = .25;
		double twoNickel = .10;
		double moneyTotal = oneDime + oneQuarter + twoNickel;


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mBrier = 18;
		int mMac = 20;
		int mFlan = 17;
		int muffinTotal = mBrier + mMac + mFlan;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoYo = .24;
		double whistleW = .14;
		double twoToys = yoYo + whistleW;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int marshL = 8;
		int marshMin = 10;
		int totalMarsh = marshL + marshMin;



        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int houseHilt = 29;
		int schoolB = 17;
		int snowDiff = houseHilt - schoolB;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double hiltMoney = 10.00;
		double toyTruck = 3.00;
		double toyPencil = 2.00;
		double moneyLeftOver = hiltMoney - (toyTruck + toyPencil);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		int marblesLost = 7;
		int marblesTotal = marbleCollection - marblesLost;



        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seaShell = 19;
		int shellWanted = 25;
		int shellNeeded = shellWanted - seaShell;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBallon = 17;
		int bradRed = 8;
		int balloonGreen = bradBallon - bradRed;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int bookShelf = 38;
		int bookAdded = 10;
		int bookTotal = bookShelf + bookAdded;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int beeEight = beeLegs * 8;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double iceCone = .99;
		double twoCone = iceCone * 2;




        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNow = 64;
		int rocksTotal = 125;
		int rocksNeeded = rocksTotal - rocksNow;



        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int currMarble = 38;
		int lossMarble = 15;
		int nowMarble = currMarble - lossMarble;




        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int milesDriven = 78;
		int milesCurrent = 32;
		int milesLeft = milesDriven - milesCurrent;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int snowTime = 90;
		int snowTimeTwo = 45;
		int snowTimeFinal = snowTime + snowTimeTwo;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotdog = 6;
		double hotdogPrice = 0.5;
		double hotdogBill = hotdog * hotdogPrice;



        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltWallet = 50;
		int pencilCost =  7;
		int pencilQual = hiltWallet / pencilCost;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterSaw = 33;
		int butterOrange = 20;
		int butterRed = butterSaw - butterOrange;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyGiven = 1.00;
		double candyCost = .54;
		double cashBack = moneyGiven - candyCost ;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int treeMark = 13 ;
		int treePlant = 12;
		int plantNow = treeMark + treePlant;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int dayHours = 24;
		int daysLeft = 2;
		int hoursLeft = dayHours * daysLeft;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousinNum = 4;
		int gumNum = 5;
		int gumGiven = cousinNum * gumNum;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danWallet = 3.00;
		double candyBar = 1.00;
		double cashLeft = danWallet - candyBar;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatLake = 5;
		int boatPeople = 3;
		int boatTotal = boatLake * boatPeople;



        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int legoTotal = 380;
		int legoLost = 57;
		int legoLeft = legoTotal - legoLost;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinBaked = 35;
		int muffinGoal = 83;
		int muffinLeft = muffinGoal - muffinBaked;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayon = 1400;
		int lucyCrayon = 290;
		int willyMore = willyCrayon - lucyCrayon;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickerPage = 10;
		int pageNumber = 22;
		int stickerTotal = stickerPage * pageNumber;


        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		double cupcakeTotal = 96.0;
		double childrenNumber = 8.0;
		double cupPerson = cupcakeTotal /childrenNumber;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int cookie =47;
		int jarCookie = 6;
		int leftOver = cookie%jarCookie;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int cross = 59;
		int neighbor = 8;
		int crossLeft = cross%neighbor;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookieTray = 12;
		int oatCook = 276;
		int trayCook = oatCook/cookieTray;


        /* Exercise 43
        43. Marian???s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretBite = 480;
		int pretReal = 12;
		int realPret = pretBite/pretReal;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCup = 51;
		int boxThree = 3;
		int boxesTotal = lemonCup/boxThree;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int momCarrot = 74;
		int peopleTwelve = 12;
		int leftOverCarrot = momCarrot%peopleTwelve;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int susieBear = 98;
		int shelfSpace = 7;
		int filledShelf = susieBear/shelfSpace;


        /* Exercise 47
        47. Susie???s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int famPix = 480;
		int albumSpace = 20;
		int albumNeed = famPix/albumSpace;


        /* Exercise 48
        48. Joe, Susie???s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradeCard = 94;
		int boxMax = 8;
		int boxFilled = tradeCard/boxMax;
		int boxRemain = tradeCard%boxMax;


        /* Exercise 49
        49. Susie???s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int bookFather = 210;
		int shelfDad = 10;
		int bookShelfTwo = bookFather/shelfDad;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double crossBread = 17;
		double guestNumber = 7;
		double guestBread = crossBread/guestNumber;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */

		double billAv = (12*14)/2.15;
		double jillAv = (12*14)/1.90;
		double bjAve = billAv + jillAv;
		double bjTotal = (5)*(12*14)/(bjAve) ;







	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" ???> "Smith, John D."
	    */

		String lastName = "Hopper";
		String firstName = "Grace";
		String comma = ", ";
		String middleInt = " B.";
		String combinedName =  lastName + comma	+ firstName + middleInt;
		System.out.println(combinedName);



	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double tripTrav = 537.0;
		double tripTot = 800.0;
		double tripFra = tripTrav/tripTot;
		int tripFin = (int) (tripFra * 100);


	}

}
