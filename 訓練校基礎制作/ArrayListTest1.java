import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* �ݿ�قɕ\����Ҳݸ׽
 * @author Miyashita m
 * @version 2022 12/6
 */

public class ArrayListTest1 {

  public static void main(String[] args) {
    /*  �ް���ݿ�قɕ\��
     *CSV����ǂݍ���ArrayList�̕\��
     * bҿ���
     */

    Methods.array_List();
    System.out.println(Constant.LINE);

    // �����p���͈ē��\��
    System.out.println(Constant.START_GUIDE);
    //��������ҿ��� C
    Methods.array_Serch_List();
  }
}
