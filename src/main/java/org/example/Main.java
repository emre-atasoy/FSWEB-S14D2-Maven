package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 60, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 85);
        Wardrobe wardrobe = new Wardrobe(120, 200, 75.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        // Metod testleri
        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}