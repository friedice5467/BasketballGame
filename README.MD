#ABOUT
Basketball simulation with 10 players, 2 teams, 5 players on each team at it's current form. Eventually it will be fleshed out to have a league with multiple teams, more players, game modes, and better statistics. I will use this readme also as a devlog to track my progress.

#TODO
*DONE*) Rewrite the points hashmaps and put them as player class variable for long term
1.5) fix the bug with incorrect end of season data
2) Implement better player attributes and separate it from overall team attributes
3) Implement Player tendencies
4) Implement better possessions
5) Implement rebounds
6) Implement steals
7) Implement 3PT
8) Implement Foul, FT
9) Implement rotations, substitutions
10) Implement User Input for an actual game
11) Implement data backend, save/load
12) Add more teams, more players
13) Implement an actual game mode
14) Rewrite it for Android, obfuscate
15) Rewrite in C#/Unity, make it look like an actual video game, and publish it on steam/itch.io

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
