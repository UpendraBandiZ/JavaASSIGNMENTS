package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

class SearchFiles {
    public void findFiles(String path, String regExp) {
        File folder = new File(path);
        File fileNames[] = folder.listFiles(); // listing all the fileNames in given directory path
        if (fileNames!= null && fileNames.length > 0) {
            for (File file : fileNames)
                if (file.isDirectory()) { // If file is a Directory to check in the directory
                    findFiles(file.getAbsolutePath(), regExp);
                } else if (file.getName().contains(regExp)){
                    System.out.println(file.getAbsolutePath() + "     " + file.getName());
                }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter your Regular Expression:");
            String regExp = br.readLine();
            if(regExp.contentEquals(""))
                break;
            SearchFiles searchFiles = new SearchFiles();
            searchFiles.findFiles("/home/upendb/Desktop/Java", regExp);
        }
        System.out.println("exit done");
    }
}