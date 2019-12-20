package game;

import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.events.KeyPressedEvent;
import game.background.BackgroundObjects;
import player.Player;
import scenes.Scene;
import scenes.SceneListener;
import sprites.SpriteSet;

public class GameScene extends Scene implements GameConfig, Assets {

    private BackgroundObjects backgroundObjects;
    private Player player;

    public GameScene(String tag, SceneListener listener) {
        super(tag, BACKGROUND_IMAGE_PATH, listener);
        initBackground();
        initPlayer();
    }

    private void initBackground() {
        backgroundObjects = new BackgroundObjects(0,0);
    }

    private void initPlayer() {
        SpriteSet[] sprites = new SpriteSet[2];
        sprites[0] = SpriteSet.createSet("running", PLAYER_SPRITES_RUNNING, PLAYER_ANIMATION_SPEED);
        sprites[1] = SpriteSet.createSet("jumping", PLAYER_SPRITES_JUMPING, PLAYER_ANIMATION_SPEED);
        player = new Player(GameConfig.PLAYER_START_POSITION_X,GameConfig.PLAYER_START_POSITION_Y, sprites);
    }

    public void update() {
        backgroundObjects.update();
        player.update();
    }

    public void draw() {
        super.draw();
        backgroundObjects.draw();
        player.draw();
    }

    public void onKeyPressed(KeyPressedEvent event) {
        if(event.getKeyCode() == KeyPressedEvent.VK_SPACE) {
            player.jump();
        }
    }

}
