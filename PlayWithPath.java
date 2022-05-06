package org.paumard.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PlayWithPath {

    public static void main(String[] args){

        //Path path1 = Paths.get("/images/jo.jpg");
        Path path1 = Paths.get("c:/images/jo.jpg");
        //Path path1 = Paths.get("//images/jo.jpg");
        //Path path2 = Path.of("images/jo1.jpg");
        Path path2 = Path.of("jo1.jpg");

        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);
        System.out.println("path1 = " + path1.getClass());

        boolean absolute = path1.isAbsolute();
        System.out.println("absolute = " + absolute);


        Path root = path1.getRoot();
        System.out.println("root = " + root);

        Path p1 = path1.resolve(path2);
        System.out.println("resolve = " + p1);














    }


}
