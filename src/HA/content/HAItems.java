package HA.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class HAItems {
	public static Item
		zinc, neodymium;

    public static void load(){
    zinc = new Item("zinc", Color.valueOf("b1b7c1")) {{
           cost = 1;
           hardness = 1;
			     explosiveness = 0.05f;
    }};
    neodymium = new Item("neodymium", Color.valueOf("959595")) {{
                cost = 2;
                charge = 1.5f;
                hardness = 5;
			          explosiveness = 0.5f;
	      }};

	}
}
