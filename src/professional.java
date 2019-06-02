/**
 * this class represent the professional user status.
 */
public class professional implements ImovieDownloader {

    private DownloaderMachine machine;
    private userStatus father;

    public professional(DownloaderMachine Dm, userStatus father){
        this.machine = Dm;
        this.father = father;
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
        //check for new status.
        if (machine.getScore() < 7 && machine.getScore() > 3){
            machine.setSpeedRate(1.2);
            father.setCurrState(father.getAdvanced());
        }
        else if (machine.getScore() < 4){
            machine.setSpeedRate(1);
            father.setCurrState(father.getBeginner());
        }
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
        System.out.println("enter professional state");
    }

    @Override
    public void exit() {
        System.out.println("exit professional state");
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
}
