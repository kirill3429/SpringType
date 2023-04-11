package koschei.models;

import koschei.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    private Island2 island;

    @Autowired
    private void setIsland(Wood3 wood3) {
        island = AppConfig.getIsland(wood3);
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
