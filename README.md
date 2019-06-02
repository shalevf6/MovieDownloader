# MovieDownloader
## In our program we have the following events which the user can trigger:
turOn - turn the system on
turnOff - turn the system off
internetOn - the internet connection is connected
internetOfff - the internet connection is disconnected
fileRequest - an attempt to request a file download
downloadAborted - cancel downloading the file
downloadError - there is an error downloading the file
errorFixed - the error is fixed
movieOn - a request to watch a downloading movie
restartMovie - a request to restart a downloading movie
holdMovie - a request to pause a watch of a downloading movie
movieOff - a request to stop a watch of a downloading movie
resume - a request to resume a watch of a downloading movie

## In addition, the following events are triggered throughout the program's run by other events:
removeRequest - removing the downloading request. 
scoreChanged - increase the score of the user by one when a movie downloads successfully
QisNotEmpty - when the user request to download a movie
checkSpace - check if the system have enough space to storage the movie (currFreeSpace(מקום פנוי במערכת) < movieSize(גודל הסרט)) and return true if there is enough space.
updateDownloadStatus - update the downloadingStatus of the movie in the system.
inDeletingMovie - indicate that a thread is in "deletingMovie" state.
watching - when a user want to watch the movie while the movie is downloading
downloadingDone - indicate that the download of a movie is finished successfully
entry - Performs the unique functionality of each state as soon as you move to it.
exit - Performs the unique functionality of each mode as soon as you move from it.
initDownloadingStatus - When a movie comes to state downloadingMovie for the first time, that means that a user applies for a movie download and the download begins. Updating movieSize variable to the size of the movie and downloadingStatus variable to 0.
changeDiskSize - when the user want to change the size of the disk. (the event receives an int parameter of the new disk space).

## The global variables we use are as follows:
score - the current user's score
currFreeSpace - the current free space left on the disk
downloadingStatus - how much the current download has progressed
movieSize - the current movie's size (whether its in download or waiting to be requested to be downloaded)
speedRate - the downloading speed rate of the user

## The following states exist:
IMovieDownloader - the interface for all the states
turnOn - the system is on
turnOff - the system is off
requestQueue - the request queue is on
userStatus - the userStatus check is on
internet - the internet check is on
queueM - the queue is active
beginner - the user is in beginner state
advanced - the user is in advanced state
professional - the user is in professional state
internetOff - the internet is off
internetOn - the internet is on
Download - the download of a single file
Watch - the watch of a single file
idleDownloading - not downloading
firstSpaceCheck - the first avaliable space check for downloading the file
secondSpaceCheck - the second avaliable space check for downloading the file
downloadingMovie - downloading a single file
deletingMovie - deleting a single file download request
errorOccured - an error while downloading a file
idleWatching - not watching
pauseMovie - pausing the watching of a file
WatchingMovie - watching a file


