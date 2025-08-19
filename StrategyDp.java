package coderArmy.ys.LLD.Singleton;
interface WalkableRobot {
    void walk () ;
}

//--------------Concrete class-------------------
class NormalWalk implements WalkableRobot {
    public void walk() {
        System.out.println("I can walk!");
    }
}
class NoWallk implements WalkableRobot {
    public void walk() {
        System.out.println("I can't walk!");
    }
}
interface TalkableRobot{
    void walk() ;
}

// ---------------concrete classes------------------
class NormalTalk implements TalkableRobot {
    public void walk() {
        System.out.println("I can Talk1");
    }
}
class NoTalk implements TalkableRobot {
    @Override
    public void walk() {
        System.out.println("I cant walk !");
    }
}
interface FlyableRobot{
    void fly() ;

}
//------------------concrete classes
class NormalFly implements FlyableRobot {
    @Override
    public void fly() {
        System.out.println("I can fly !");
    }
}
class NoFly implements FlyableRobot{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
//---------------main robot-------------
abstract class Robot {

    protected WalkableRobot walkableRobot;
    protected TalkableRobot talkableRobot;
    protected FlyableRobot flyableRobot;

    public Robot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
        this.flyableRobot = f;
        this.talkableRobot = t;
        this.walkableRobot = w;
    }

    public void talk() {
        talkableRobot.walk();
    }

    public void walk() {
        walkableRobot.walk();
    }

    public void fly() {
        flyableRobot.fly();
    }


    public abstract void projection();
}

class CompanionRobot extends Robot {
    public CompanionRobot(WalkableRobot w , TalkableRobot t , FlyableRobot f ) {
        super(w,t,f);
    }

    public void projection() {
        System.out.println("Displaying friendly companion features...");
    }
}

class WorkerRobot extends Robot {
    public WorkerRobot(WalkableRobot w , TalkableRobot t , FlyableRobot f ) {
               super(w,t,f);
    }
    public void projection() {
        System.out.println("Displaying worker efficiency stats...");
    }
}


public class StrategyDp {
    public static void main(String[] args) {

        Robot robot = new CompanionRobot(new NormalWalk() , new NormalTalk() , new NormalFly() ) ;
        robot.fly();
        robot.talk();
        robot.walk() ;
        Robot robot1 = new WorkerRobot( new NoWallk() , new NoTalk() , new NoFly()) ;
        robot1.talk();
        robot1.fly();
        robot1.walk();

    }

}
