/**
 * this class represent the turning off state
 */
public class turnOff implements ImovieDownloader{


    private DownloaderMachine machine;

    public turnOff(DownloaderMachine machine) {
        this.machine = machine;
    }


    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {
        machine.setCurrMachineState(machine.getTurnon());
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
    public ImovieDownloader getCurrState() {
        return null;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {

    }

    @Override
    public void initDownloadingStatus(int movieSize) {

    }

    @Override
    public void entry() {
        System.out.println("enter turnOff state");
    }

    @Override
    public void exit() {
        System.out.println("exit turnOff state");
    }
}
