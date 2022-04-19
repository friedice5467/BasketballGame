### ABOUT
Basketball simulation with 10 players, 2 teams, 5 players on each team at it's current form. Eventually it will be fleshed out to have a league with multiple teams, more players, game modes, and better statistics. I will use this readme also as a devlog to track my progress.

### TODO

1) ~Rewrite the points hashmaps and put them as player class variable for long term~
2) fix the bug with incorrect end of season data
3) Implement better player attributes and separate it from overall team attributes
4) Implement Player tendencies
5) Implement better possessions
6) Implement rebounds
7) Implement steals
8) Implement 3PT
9) Implement Foul, FT
10) Implement rotations, substitutions
11) Implement User Input for an actual game
12) Implement data backend, save/load
13) Add more teams, more players
14) Implement an actual game mode
15) Rewrite it for Android
16) Rewrite in C#/Unity
17) Add GUI
18) Publish?

Version .035
1) Removed LeagueSim class
2) Removed box score from Game class and all use cases
2) implemented Player variables to track game points and overall points

Version .03
1) added a league where multiple teams play each other over a course of a season
2) fixed issue with Team class where it was deleting team names too often before generation leading to an empty array
3) fixed run() in Main class so that teams aren't randomly generated each loop

Version .021
1)removed null for 0 in box score

Version .02
1) Added boxscore for individual players using merge()

Version .015
1) Added random names for players and teams

Version .011
1) Refactored code to be more readable (no magic numbers)

Version .01
1) Rewrote everything
2) Simplified code
3) simulation is now runnable

Version .001
1)Created Devlog
2)Created functionality for a player to score 2 points based on amount of possessions they have
