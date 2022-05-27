package com.company;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File mainDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games");
        File srcDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/src/");
        File resDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/res/");
        File saveDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/savegames/");
        File temp = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/temp/");

        File testDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/src/test/");
        File mainSrcDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/src/main/");

        File mainJava = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/src/main/", "Main.java");
        File utilsJava = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/src/main/", "Utils.java");

        File drawDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/res/drawables");
        File vectorsDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/res/vectors");
        File iconsDir = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/res/icons");

        File tempTxt = new File("/Users/evgeniasevastanova/Downloads/My Fava/Games/temp/temp.txt");

        StringBuilder sb = new StringBuilder("");

        try {
            if (tempTxt.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        mainDir.mkdir();

        if (mainDir.exists()) {
            sb.append("Directory " + mainDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + mainDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        srcDir.mkdirs();
        if (srcDir.exists()) {
            sb.append("Directory " + srcDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + srcDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        resDir.mkdir();

        if (resDir.exists()) {
            sb.append("Directory " + resDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + resDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        saveDir.mkdir();

        if (saveDir.exists()) {
            sb.append("Directory " + saveDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + saveDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        temp.mkdir();

        if (temp.exists()) {
            sb.append("Directory " + temp.getName() + ": CREATED! \n");
            System.out.println("Directory " + temp.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        testDir.mkdir();

        if (testDir.exists()) {
            sb.append("Directory " + testDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + testDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        mainSrcDir.mkdir();

        if (mainSrcDir.exists()) {
            sb.append("Directory " + mainSrcDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + mainSrcDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        mainJava.mkdirs();

        if (mainJava.exists()) {
            sb.append("Directory " + mainJava.getName() + ": CREATED! \n");
            System.out.println("Directory " + mainJava.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        utilsJava.mkdirs();
        if (utilsJava.exists()) {
            sb.append("Directory " + utilsJava.getName() + ": CREATED! \n");
            System.out.println("Directory " + utilsJava.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        drawDir.mkdirs();

        if (drawDir.exists()) {
            sb.append("Directory " + drawDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + drawDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        vectorsDir.mkdirs();

        if (vectorsDir.exists()) {
            sb.append("Directory " + vectorsDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + vectorsDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");

        iconsDir.mkdirs();

        if (iconsDir.exists()) {
            sb.append("Directory " + iconsDir.getName() + ": CREATED! \n");
            System.out.println("Directory " + iconsDir.getName() + " was created successful");
        } else
            System.out.println("Unknown error");


        try (FileWriter installationLogs = new FileWriter(tempTxt, false)) {
            installationLogs.append(sb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

