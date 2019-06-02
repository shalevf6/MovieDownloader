import java.util.concurrent.TimeUnit;
public interface ImovieDownloader {

    //events must have by those names

    //restarting the movie to the beginning.
    void restartMovie();
    //pausing the movie.
    void holdMovie();
    //stopping the movie.
    void movieOff();
    //resuming the movie.
    void resume();
    //start watching the movie.
    void movieOn();
    //the error was fixed.
    void errorFixed();
    //error occurred
    void downloadError();
    //the user canceled the download.
    void downloadAborted();
    //the user ask for file to be downloaded.
    void fileRequest();
    //the internet turned off.
    void internetOff();
    //the internet turned on.
    void internetOn();
    //the machine turned off.
    void turnOff ();
    //the machine turned on.
    void turnOn();

    //ours.

    //removing file request.
    void removeRequest();
    //check for user status change. called after scored change.
    void scoreChanged();
    //check if the queue is empty.
    void QisNotEmpty();
    //checking for free space on disk.
    void checkSpace();
    //updating the download statue.
    void updateDownloadStatus();
    //check if the stats of the download is in deleting.
    void inDeletingMovie();
    //event of downloading is done.
    void downloadingDone();
    //action on entering the state.
    void entry();
    //action on the exiting the state.
    void exit();
    //getting the current state of the machine.
    ImovieDownloader getCurrState();
    //setting the current state of the machine.
    void setCurrState(ImovieDownloader state);
    //init the downloading status.
    void initDownloadingStatus(int movieSize);
}
