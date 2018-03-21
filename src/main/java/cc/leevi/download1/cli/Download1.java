package cc.leevi.download1.cli;

import cc.leevi.download1.model.standard.StandardTrack;
import cc.leevi.download1.provider.TrackProvider;
import cc.leevi.download1.provider.netease.NeteaseTrackProvider;
import com.github.kevinsawicki.http.HttpRequest;
import org.apache.commons.cli.*;
import org.apache.commons.lang3.StringUtils;

import java.io.FileOutputStream;
import java.util.List;

public class Download1 {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("p",true,"playlist id");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options,args);
        String basePath = "C:\\Downloading1";
        if(cmd.hasOption("p")){
            TrackProvider trackProvider = new NeteaseTrackProvider();
            List<StandardTrack> playList = trackProvider.getPlayList(cmd.getOptionValue("p"));
            for(StandardTrack track : playList){

                System.out.println(String.format("Downloading... %s - %s - 《%s》 duration: %d",track.getName(),track.getArtist().getName(),track.getAlbum().getName(),track.getDuration()));
                String url = trackProvider.getTrackUrl(track.getId());
                if(StringUtils.isEmpty(url)){
                    System.out.println(String.format("break 《%s》",track.getName()));
                    continue;
                }
                try(FileOutputStream fos = new FileOutputStream(basePath+"\\"+track.getName()+" - "+track.getArtist().getName()+url.substring(url.lastIndexOf(".")))){
                    HttpRequest.get(url).receive(fos);
                    System.out.println("Downloaded!");
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
            System.out.println(playList);
        }
    }
}
