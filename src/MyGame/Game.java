package MyGame;

import com.sun.javafx.PlatformUtil;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String,Handler> handlers = new HashMap<String,Handler>();
    private Player currentPlayer;
        
    public Game() 
    {
        handlers.put("go",new HandlerGo(this));
        handlers.put("fight",new HandlerFight(this));
        handlers.put("bye",new HandlerBye(this));
        handlers.put("help",new HandlerHelp(this));
        handlers.put("change",new HandlerChage(this));
        createRooms();
        setPlayers();

    }

    private Players setPlayers() {
        Players players=new Players();
        Player SWK=new Player("孙悟空",1000,100,100);
        Player TS =new Player("唐僧",500,10,10);
        Player ZBJ=new Player("猪八戒",2000,70,20);
        Player SHS=new Player("沙和尚",800,50,70);
        players.addPlayer(SHS.getName(),SHS);
        players.addPlayer(SWK.getName(),SWK);
        players.addPlayer(TS.getName(),TS);
        players.addPlayer(ZBJ.getName(),ZBJ);
        //set currentPlayer=SWK;
        currentPlayer=SWK;
        return players;

    }


    public void play(){
        Scanner in = new Scanner(System.in);
        while ( true ) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            Handler handler=handlers.get(words[0]);
            String value="";
            if(words.length>1){
                value=words[1];
            }

            if(handler!=null){
                handler.doCmd(value);
                if(handler.isBye()){
                    break;
                }
            }
        }
        in.close();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExit("east",lobby);
        outside.setExit("south",study);
        outside.setExit("west",pub);
        lobby.setExit("west",outside);
        pub.setExit("south",outside);
        study.setExit("north",outside);
        study.setExit("east",bedroom);
        bedroom.setExit("west",study);
        lobby.setExit("up",pub);
        pub.setExit("down",lobby);

        currentRoom = outside;  //	从城堡门外开始

    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();

        showPrompt();
    }

    // 以下为用户命令
    public void changePlayer(String playername){
        Players players=setPlayers();
        currentPlayer=players.chosePlayer(playername);
        showPrompt();
    }
    public void goFight(){

    }

    public void goRoom(String direction)
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void showPrompt(){
        System.out.println("你在" + currentRoom);
        System.out.println("你的人物是"+currentPlayer);
        System.out.print("出口有: ");
        System.out.println(currentRoom.getExitDesc());
        System.out.println();
    }
	
	public static void main(String[] args) {

		Game game = new Game();
		game.printWelcome();
        game.play();


        
        System.out.println("感谢您的光临。再见！");


	}

}
