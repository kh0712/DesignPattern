package desingpattern.command;

public class KakaoMini {


    private Command command = null;

    public KakaoMini() {
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void talk(){
        if(command == null){
            return;
        }
        command.run();
    }
}
