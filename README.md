# NativeSupportInJava

Simple example of Java code with native methods. These native methods are filled in by code in C. 
All you have to do is download the NativeClass.java, NativeClassImp.c and build.sh.
The build.sh script has to be executed when the download is done.
The following steps are done by the script:
  - Compiling Java code
  - Generating C header file for current Java Class
  - Compile the C code
  - Linking into shared libraries
  - Renaming library files to usefull names
  - Setting library path

When the script is done, you can simply excecute the Java code with:
java -Djava.library.path=. NativeClass
