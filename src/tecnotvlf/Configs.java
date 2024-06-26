/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnotvlf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author localadmin
 */
public class Configs {

    public static final String mainUrl = "https://spinoff.link/listas-premium/";
    public static final String geoMexUrl = "https://spinoff.link/listas-gomex/";
    public static final String android3Url = "https://spinoff.link/listas-android/";
    public static final String canal6 = "https://mdstrm.com/live-stream-playlist/5f2d9d6ff17144074bd8a284.m3u8";
    public static final String RT = "https://rt-esp.rttv.com/live/rtesp/playlist.m3u8";
    public static final String urlRoku = "http://192.168.1.27:8060";
    public static final String[] listasCanales = new String[]{"Premium", "GeoMex", "Android3"};
    public static final String param = "/launch/63218?live=false&autoCookie=false&debugVideoHud=false&url=";
    public static final String param2 = "&fmt=Auto&drmParams=%7B%7D&headers=%7B%7D&metada=%7B%22isFullHD%22%3Afalse%7D&cookies=%5B%5D";
    public static final String paramSt = "/query/media-player";
    public List<String> allChannels = new ArrayList<>();

    public Configs() {
        allChannels.add("History Channel");
        allChannels.add("History ");
        allChannels.add("HISTORY ");
        allChannels.add("Discovery");
        allChannels.add("DISCOVERY");
        allChannels.add("Discovery Channel");
        allChannels.add("Film & Arts");
        allChannels.add("FilmArts");
        allChannels.add("Film & arts");
        allChannels.add("National ");
        allChannels.add("NatG");
        allChannels.add("NatGeo");
        allChannels.add("NATIONAL");
        allChannels.add("National Geographic");
        allChannels.add("Paramount HD");
        allChannels.add("Paramount");
        allChannels.add("PARAMOUNT");
        allChannels.add("TNT");
        allChannels.add("Tnt");
        allChannels.add("Studio Universal");
        allChannels.add("Universal");
        allChannels.add("CINEMAX");
        allChannels.add("Cinemax");
        allChannels.add("Premier");
        allChannels.add("PREMIER");
        allChannels.add("HBO");
        allChannels.add("hbo");
        allChannels.add("RT");
    }

    public boolean channelExists(String chan) {
        for (String idx : allChannels) {
            if (chan.indexOf(idx) != -1) {
                return true;
            }
        }
        return false;
    }

}
