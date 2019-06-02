/*
this class represent the first space check.
 */
public class firstSpaceCheck implements ImovieDownloader {

    DownloaderMachine machine;
    Download father;

    public firstSpaceCheck(DownloaderMachine dm, Download download) {
        this.father = download;
        this.machine = dm;
    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void fileRequest() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void removeRequest() {

    }

    @Override
    public void scoreChanged() {

    }

    @Override
    public void QisNotEmpty() {

    }

    @Override
    public void checkSpace() {

    }

    @Override
    public void updateDownloadStatus() {

    }

    @Override
    public void inDeletingMovie() {

    }

    @Override
    public void downloadingDone() {

    }

    @Override
    public void entry() {
        System.out.println("enter firstSpaceCheck state");
        int currentMovieSize =machine.getMovieSize();
        //if current free space smaller then movie size need to change state
        //to second check.
        if(machine.getCurrFreeSpace()>=currentMovieSize){
            machine.getCurrMachineState().initDownloadingStatus(currentMovieSize);
            father.setCurrState(father.getDownloadingMovie());
        }
        else{
            father.setCurrState(father.getSecondSpaceCheck());
        }
    }

    @Override
    public void exit() {
        System.out.println("exit firstSpaceCheck state");
    }

    @Override
    public ImovieDownloader getCurrState() {
        return null;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {

    }

    @Override
    public void initDownloadingStatus(int currentMovieSize) {

    }
}
