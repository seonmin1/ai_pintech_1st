package exam01;

import java.io.File;

/**
 * File 실습
 * - 디렉토리 생성
 */
public class Ex19 {
    public static void main(String[] args) throws Exception {
        File dir = new File("D:/tmp/sub/sub2"); // 경로가 실제로 있는지 체크, 없으면 생성
        if(!dir.exists()) { // 디렉토리가 없을 경우 디렉토리를 만듦
            // dir.mkdir(); // 디렉토리를 한개만 생성
            dir.mkdirs(); // 하위 디렉토리도 생성
        }
        File file = new File(dir, "test.txt");

        file.createNewFile();
    }
}
