package game;

import config.Assets;
import config.GameConfig;
import scenes.Scene;
import scenes.SceneListener;

public class GameScene extends Scene implements GameConfig, Assets {

    public GameScene(String tag, SceneListener listener) {
        super(tag, BACKGROUND_IMAGE_PATH, listener);
    }

}
