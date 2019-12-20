import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import config.GameConfig;

public class SnowballFight extends GraphicsApp implements GameConfig{


    @Override
    public void initialize() {
        setFrameRate(TARGET_FPS);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
    }
}
