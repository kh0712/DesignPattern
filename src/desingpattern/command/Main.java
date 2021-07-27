package desingpattern.command;

public class Main {

    public static void main(String[] args) {
        Command heaterCommand = new HeaterCommand(new Heater());
        Command lampCommand = new LampCommand(new Lamp());

        KakaoMini kakaoMini = new KakaoMini();

        kakaoMini.setCommand(heaterCommand);
        kakaoMini.talk();

        kakaoMini.setCommand(lampCommand);
        kakaoMini.talk();
    }
}
