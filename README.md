# JungleEscape

Directions: 
JungleEscape is a game where you are trying to outrun zombies inf jungle during a zombie apocolypse to save your life. Run bash play.sh to open JungleEscape. You reach a forest where you are safe (for now). Use the right arrow key to move right until the edge of the screen (if you hold on to the key too long it might run through the scene too quickly and skip it). While running through the forest, you get to a river and find a box with a puzzle (2048). Play 2048 by using the up, down, left, and right arrow keys to combine the numbers and reach 2048. This will open the box to find wood with numbers on the back. Sorting the numbers (15 Puzzle) will build the bridge to the river. Use the up, down, left, right keys here as well. Crossing the river, you continue running until you reach a highway and see a safe haven. To cross the highway, use your arrow keys and avoid the cars. 

1/4/2019
Vivien: We spent most of class talking in general about how to code for different parts of the games. I added a createbackground() to TerminalDemo to form the grid for 2048.
Maisha: I spent most of my time trying to picture the background for 15 Puzzle and started writing code for it. I created a Tile class which is a part of the fifteenPuzzle class. 

1/6/2019
Vivien: I restarted from scratch, realizing that I didn't need to include any of the terminal aspects in the NumberPuzzle class. Partway in, after I had already made a few commits, I realized I named the NumberPuzzle class incorrectly, so I removed the old numberPuzzle and created a new file, copying the code from the other one. I finished writing constructor, toString(), all the move methods and isComplete(). Next, I need to start working on JungleEscape to incorporate the terminal and keystrokes. 
Maisha: I kept working on my Tile class and wrote most of its methods. I had to fix what I started before and make the variables private instead of public. I also started writing fifteenPuzzle.java. 

1/7/2019
Vivien: After I did additional testing on my NumberPuzzle, I realized there were a lot of problems, so I spent today fixing those issues. I had to redesign the grid, changing it to a String 2d-array to fit four digit numbers. Then, I added an inputNewNum() that adds a new num once the player has made a move. My next step is to incorporate the terminal and keystrokes. 
Maisha: I finished writing the Tile class and used the Terminal Demo code to write the terminal code into fifteenPuzzle.java. I had to start over a few times because I didn't understand why the terminal wouldn't print out my grid correctly. 

1/8/2019
Maisha: Vivien and I talked about the necesities of the terminal code and we have yet to decide if we are just going to keep all the key controls in our main JungleEscape game or keep them in the game. I spent most of the class trying to figure out how to merge and deal with branches to gitHub. 
Vivien: I focused on trying to get 2048 to work with terminal input. I got the grid and beginning numbers to show up on a terminal in private mode. However, when I use the keystrokes, I'm not sure if 2048 is slow or just not moving at all. I need to test that and see if I need to use the Screen class intead. 

1/9/2019
Vivien: I worked on trying to fix the display issue. During class, I got the terminal to respond to the escape key, but it did not respond to any other. At home, I got the other keys to work. However, although addNewNum is implemented, the numbers are not moving. I'm not sure why. 
Maisha: I kept trying to get around the terminal code and how to make test the code on my laptop. I worked out issues with github. I have gotten used to merging and committing by now. 

1/10/2019
Vivien: I made a lot of headway today. After taking Mr. K's suggestion, I rewrote my NumberPuzzle class and it was much easier to write. I still had a little difficulty writing a method that would allow me to adjust the spacing for different digit numbers, but I created a new method addSpaces that fixed that. Everything with NumberPuzzle seems to be working fine, so tomorrow I can incorporate the terminal display portion of the code and finish NumberPuzzle. 
Maisha: After finally testing it on the school computer, I saw that my code did print out my grid successfully. I have thus finished printing the grid and also wrote the key contorl commands. 

1/11/2019
Vivien: I finished writing and testing the main in NumberPuzzle. When I was working on my code at home, I found that the terminal did not register keystrokes and therefore did not move 2048. However, when I used PuTTy to ssh into the school computers, NumberPuzzle worked properly.
Maisha: I took Vivien's advice and downloaded PuTTy to my laptop and used it to ssh into the school computer. I am currently working on fixing my merging issues and keeping track of my files

1/12/2019
Maisha: Today I worked on using PuTTy and am editing my code so that it can be tested. It prints fine but switching two tiles doesn't. 
Vivien: I worked on play2048 and JungleEscape and sucessfully got play2048 to be called from JungleEscape. 

1/13/2019
Maisha: I continued trying to fix my issues with FifteenPuzzle. I then started working on the JungleEscape file to incorporate some of the dialogue and words. I also transitioned between scene 1 and playing 2048 puzzle. 
Vivien: I worked on adding the backgrounds for the first two scenes. In the beginning, I had a lot of difficulty setting up the background because I didnt realize had to put each row in a different putString. I created scene1 and scene2 where the player can walk across the terminal and incorportated play2048 as the first game. I attempted to complete FifteenPuzzle, but I was unable to.  

1/14/2019
Vivien: I completed SecondPuzzle (FifteenPuzzle)! I had the skeleton from yesterday but I had to go back and fix the exceptions and missing code. SecondPuzzle works as is, but depending on how difficult to play the other parts of the game are, I might go back and make SecondPuzzle easier (less scrambled) or make a restart method. For tomorrow, I need to incorporate SecondPuzzle into JungleEscape and work on scene3. A couple problems I am noticing are that the grids (for both 2048 and 15 Puzzle) sometimes flash and the individual games have diffficulty exiting private move. 
Maisha: I tweaked bit of the dialogue in Scene 1 and 2. I started trying to fix my version of FifteenPuzzle but Vivien fixed hers before I could finish mine so we decided to use that. In class we started thinking about how the rest of our game is going to flow as well as how to incorporate Frogger. 

1/16/2019
Vivien: We spent class talking about how we could design and code Frogger. Our main concern/focus is detecting a car based on the the player's move and whether the player will die because of going into that car. For the moment, we're using a 2d string array. Because we're still in the beginning and deciding which way is best to code the class, we made seperate version (that are similar). I completed the methods needed for the constructor in Frogger and am working on moving the player around. 

1/17/2019
Maisha: I started fixing the UML Diagrams because we had a lot to add and delete especially because we changed the way our games worked based on the terminal. I had to retype it because there were a lot of changes since the first version. For example, we were planning to make scene1, scene2, and scene3 methods in JungleEscape but instead decided to make it its own class. We started thinking about how to write Frogger and started drawing sketches of the basic game and mapping out the different functions, but have not reached a conclusion yet. 

1/18/2019
Vivien: I went back and fixed problems with methods that were called from my constuctor. I got moveCarsRight and moveCarsLeft to work except when the cars are in the first or last columns. When the cars are the first or last columns, they skip 2 spaces. I need to fix that tomorrow.  

1/19/2019
Vivien: I realized that because I was moving the cars starting from one direction, a car would be moved twice at the end causing the problem from yesterday. I fixed that and then worked on moving the player. I finished and tested movePlayer without the terminal, just printing world. When I tried to combine everything with the terminal, I ran into serious problems. First, I had to go back and fix my movePlayer to account for more possibilities. I was able to fix that and the speed which the cars moved (I might want to go back and make the cars move at different speeds). However, one major problem that I still have is the player does not move after the first movement. Tomorrow I'm going to go back and double check movePlayer and see if I can get Frogger to work with ther terminal. I wrote the skeletons of the 3 remaining scenes but I need to test them. The last thing we need to add is the timer.

1/20/2019
Maisha: I started trying to add color to the game. I first started adding color to the river and am working on aestethics to the game.
Vivien: I got all the scenes to work smoothly, transitioning from one to another. Then, I found the problems with getLives in Frogger and fixed the game so that the player could move and play with three lives. However, when I finished, I talked it over with Maisha and we realized that restricting the number of tries the player had at frogger didn't make sense because our game is time based. So I started working on the timer, which I'm still in the middle of. I can't seem to get the time to properly count down. Once I get that done, I can go back to the games and add the time aspect. 

1/21/2019
Vivien: The timer took me a long time to complete. I worked with Maisha to come up with how to solve my problems with timer. First I had to find how to formate the numbers correctly so that they would display the timer correctly. Then I had to find a way to save the previous time so I could pass that into another method. There were some special cases that took me a while to find. Once I had the timer working in the first two scenes, I copied them into the others ones. Then I went back into frogger and change the game so it was time based and gave the player unlimited tries (until time runs out). I had to change all classes to include a seperate fail message that shows before exiting the game if the timer runs out. I also changed some of the prompts at the bottom. 
