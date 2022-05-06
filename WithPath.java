package org.paumard.files;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;


public class WithPath {

    public static void main(String[] args){

        //Path path1 = Paths.get("/images/jo.jpg");
        //Path path1 = Paths.get("c:/images/jo.jpg");
        //Path path1 = Paths.get("jo.jpg");
        //Path path1 = Paths.get("c:/images");
        //Path path1 = Paths.get("//images/jo.jpg");
        //Path path2 = Path.of("/images/jo1.jpg");
        //Path path2 = Path.of("images/jo1.jpg");
        //Path path2 = Path.of("jo1.jpg");
        //Path path2 = Path.of("");
        //Path path2 = Path.of("jo1.jpg");
        //Path path1 = Paths.get("c:/images/jo11/");
        //Path path2 = Path.of("c:/images/jo22/");

        //Path path1 = Paths.get("c:/musics/");
        //Path path2 = Path.of("c:/images/jo22/");
        //Path path2 = Path.of("images/jo22/");

        //Path path1 = Paths.get("musics/");
        //Path path2 = Path.of("images/jo22/");

        Path path1 = Paths.get("musics/../musics/../musics");
        Path path2 = Path.of("images/jo22/");

        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);
        System.out.println("path1 = " + path1.getClass());

        boolean absolute = path1.isAbsolute();
        System.out.println("absolute = " + absolute);


        Path root = path1.getRoot();
        System.out.println("root = " + root);

        Path p1 = path1.resolve(path2);
        System.out.println("p1 = " + p1);

        Path p2 = path1.resolveSibling(path2);
        System.out.println("p2 = " + p2);


        Path relativeP3 = path1.relativize(path2);

        System.out.println("relativeP3 = " + relativeP3);

        Path normalizeP4 = path1.normalize();

        System.out.println("NormalizeP4 = " + normalizeP4);

        File dir = new File("files/jo111");
        boolean mkdirs = dir.mkdirs();

        System.out.println("mkdirs = " + mkdirs);

        File f1 = new File("files/jo111");
        Path p5 = Paths.get("files/jo111");


        FileSystem fileSystem1 = p5.getFileSystem();
        System.out.println("filesystem1 = " + fileSystem1);




































    }

}
