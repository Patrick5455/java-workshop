public class Activity1 {

/*
Writing the Directory Structure to a File

This activity's goal is to program an application that will read the directory structure, starting from a directory that is stored in a variable. The results will be written to a text file so that for each nesting level, you will include either a tab space or four white spaces to indent nested folders visually from their respective parents. Also, you will have to show only the name of the folder and not the full path to it. In other words, the content of the file should correspond to the following structure:

Directory structure for folder: /folderA/folderB/.../folderN
folderN
    folderN1
        folderN11
        folderN12
        ...
    folderN2
        folderN21
        folderN22
        ...
    folderN3
        folderN31
        folderN32
        ...
    ...
    folderNN

    The program that you will have to create will need to have a certain depth of directories as a parameter, but we recommend you don't go too deep with this – a maximum of 10 is fine:

    Files.walkFileTree(path, Collections.emptySet(), 10, new SimpleFileVisitor<Path>() ...

    When working with the obtained paths to the directories, you need to split the resulting string using the / symbol as a separator and then take the last item. Additionally, you will have to print the number of indents based on the depth, which will require having some code that can estimate the current depth given the initial path. A trick for solving those problems could be by making the content of preVisitDirectory() like the following:

    // get the path to the init directory
    String [] pathArray = path.toString().split("/");
    int depthInit = pathArray.length;
    // get the path to the current folder
    String [] fileArray = dir.toString().split("/");
    int depthCurrent = fileArray.length;
    // write the indents
    for (int i = depthInit; i < depthCurrent; i++) {
        System.out.print("    ");
        // HINT: copy to list or write to file here
    }
    // write the directory name
    System.out.println(fileArray[fileArray.length – 1]);
    // HINT: copy to list or write to file here

    Note: If you get stuck, remember that you can find full solution files at the end of the course.

*/
}
