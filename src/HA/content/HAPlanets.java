package HA.content;

import arc.graphics.Color;
import arc.math.Mathf;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import mindustry.type.Planet;
import HA.graphics.HAPal;
import HA.maps.generators.TeegardenPlanetGenerator;
import HA.maps.generators.SetPlanetGenerator;

public class HAPlanets{

    public static Planet aelios, set;

    public static void load() {
        teegarden = new Planet("teegarden", Planets.sun, 4f, 0) {{
            bloom = true;
            accessible = true;
            hasAtmosphere = true;
            orbitRadius = 130;
            meshLoader = () -> new SunMesh(
                    this, 4, 5, 0.3f, 1.0f, 1.2f, 1, 1.3f,
                    Color.valueOf("#c2eeff"),
                    Color.valueOf("#b4d3ed"),
                    Color.valueOf("6394b8"),
                    Color.valueOf("ff6730"),
                    Color.valueOf("79abed"),
                    Color.valueOf("5cd1cd")
            );
        }};