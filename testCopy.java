package copy;

import java.io.*;
import java.lang.annotation.Target;

/**
 * auther dwayne
 * date 2018/11/15 - 16:44
 **/

public class testCopy {
    String sourceFile;
    String TargetFile;

    public testCopy(String sourceFile, String targetFile) {
        this.sourceFile = sourceFile;
        TargetFile = targetFile;
    }

    public void fileCopy(){
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(TargetFile);
            int i;
            while((i=is.read())!= -1){
                os.write(i);
                os.flush();
            }
        System.out.println("拷贝完毕！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        testCopy a = new testCopy("D:\\java workspace\\IO_study\\src\\sorceFile","D:\\java workspace\\IO_study\\src\\targetFile");
        a.fileCopy();
    }
}
