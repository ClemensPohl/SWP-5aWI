package at.cp.games.firstgame;
import org.newdawn.slick.*;
public class MainGame extends BasicGame {
    public MainGame(String title) {
        super(title);
    }

    private int x,y;
    private CircleActor ca1, ca2;
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.ca2.render(graphics);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.ca1 = new CircleActor(100,100);
        this.ca2 = new CircleActor(100,200);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        this.ca1.update(gc, delta);
        this.ca2.update(gc,delta);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(1024,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
