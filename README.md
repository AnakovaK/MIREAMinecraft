# MIREAMinecraft
A mod generating a building of MIREA in Minecraft 

To run a project:
1. Pull the project from github (through eclipse: Import -> Projects from GIT (with smart import) -> Clone URI -> Link to the project 
2. Choose the folder where you've created your project -> import -> Existing gradlew project -> MIREAMinecraft/MireaMod (might take a while)
3. Choose MIREAMod in MIREAMinecraft -> Go into. It will separate the needed files for you
4. From package explorer now choose MIREAMod as a separate folder/project. RCM -> open in terminal 
5. In terminal in the folder of project: gradlew genEclipseRuns
6. In terminal in the folder of project: gradlew eclipse
7. RCM project -> Gradle -> Refresh gradle project. Might take a while
8. RCM -> Run As -> Run configurations -> JavaApplication -> runClient

To see the created dimension:
- In terminal of the game: locate train_station. Go to it
- In train_station in the chest find a love wand item. Active the portal with it
- Go through the portal and see the new modded content of dimension.

Enjoy! :)
