import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;

/* ҿ��ޏW��׽
 * A ���������͂��郁�\�b�h inputString() @return inputWord ���͒l
 * ISR�ABR�g�p
 * B csv����ǂݍ���ArrayList�̔z��ɂ��i�[���g��for���œǂݍ��񂾑S�Ă�ArrayList��ݿ�قɕ\������ҿ��� array_List() @return arry_Data
 * ISR�AFIS�AISR�ABR�g�p
 * C csv����ǂݍ���ArrayList��z��ɂ��i�[����ArrayList[]���画�肵�����ʂ�ݿ�قɕ\������ҿ��� arry_Serch_Data() @return arry_Serch_Data
 * ISR�AFIS�AISR�ABR�g�p
 *
 * @author Miyashita m
 * @version 2022 12/6
 */

// ----------------------------------------------------------------

public class Methods {

  /**
   * A ���������͂��郁�\�b�h
   *
   * @param �Ȃ�
   * @return inputWord ���͒l
   */
  public static String inputString() {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    String inputWord = "";
    try {
      inputWord = reader.readLine();
    } catch (IOException e) {
      System.out.println(e);
    }
    return inputWord;
  }

  // ----------------------------------------------------------------
  /**
   * B csv����ǂݍ���ArrayList�̔z��ɂ��i�[��
   *  �g��for���œǂݍ��񂾑S�Ă�ArrayList��ݿ�قɕ\������ҿ���
   *
   *
   * @param �Ȃ�
   * @return arry_Data
   */
  public static String array_List() {
    /*
     * �t�@�C���ǂݍ��ݗp��BR��p��
     **/
    FileInputStream file = null;
    InputStreamReader isr = null;
    BufferedReader reader = null;
    String arry_Data = "";

    try {
      file = new FileInputStream("gaku-key.csv");
      isr = new InputStreamReader(file);
      reader = new BufferedReader(isr);

      //csv����ǂݍ��񂾗pArrayList
      List<String[]> arrData = new ArrayList<String[]>();

      //�s���Ǘ�
      int intRow = 1;
      // �ǂݍ��ݍs
      String line;

      // ��s���ǂݍ��݂��s�� �󔒍s�ɂȂ�܂œǂݍ���
      while ((line = reader.readLine()) != null) {
        // �J���}��؂��z��Ɋi�[����
        arrData.add(line.split(","));
      }
      reader.close();

      // �z��̒��g�����ʕ\�� ��(=�񖼂��i�[�����z��̗v�f��)���J��Ԃ�
      for (String[] arrs : arrData) {
        // �o�� (�s�ԍ� + "�L��" + "����"+ "����"+ "���̕��͋C");
        System.out.println(Constant.LINE);
        System.out.println(intRow + ":   " + Constant.KEY + arrs[0]);
        System.out.println("       " + Constant.KEY_NAME + arrs[1]);
        System.out.println("       " + Constant.DOMINANTO + arrs[2]);
        System.out.println("       " + Constant.KEY_FEELING + arrs[3]);

        // �s���̲ݸ����
        intRow++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return arry_Data;
  }

  // ----------------------------------------------------------------
  /**
   * C csv����ǂݍ���ArrayList��z��ɂ��i�[����ArrayList[]���画�肵�����ʂ�ݿ�قɕ\������ҿ���
   * @param �Ȃ�
   * @return arry_Serch_Data
   */
  public static String array_Serch_List() {
    /*
     * �t�@�C���ǂݍ��ݗp��BR��p��
     **/
    FileInputStream file = null;
    InputStreamReader isr = null;
    BufferedReader reader = null;
    String arry_Serch_Data = "";

    try {
      file = new FileInputStream("gaku-key.csv");
      isr = new InputStreamReader(file);
      reader = new BufferedReader(isr);

      //csv����ǂݍ��񂾗pArrayList
      List<String[]> arrData = new ArrayList<String[]>();

      // �ǂݍ��ݍs
      String line;

      // ��s���ǂݍ��݂��s�� �󔒍s�ɂȂ�܂œǂݍ���
      while ((line = reader.readLine()) != null) {
        // �J���}��؂��z��Ɋi�[����
        arrData.add(line.split(","));
      }
      reader.close();

      // �z��̒��g�����ʕ\�� ��(=�񖼂��i�[�����z��̗v�f��)���J��Ԃ�
      for (String[] arrs : arrData) {
        // �������ʏo��
        int srechCount = 0;

        // ���͂����炤 A���\�b�h
        String input = inputString();

        //�����p�޲�ޕ\��
        System.out.println(Constant.INPUT_GUIDE + input);

        // ���͂��󂾂����Ƃ��������f
        if (input.equals("")) {
          System.out.println(Constant.PROCESS_ABORTIVE);
          break;
        }
        // ���͂����l���猟�����ʂ��o�͂��郁�\�b�h
        for (String[] arrc : arrData) {
          if (input.equals(arrc[0])) {
            // �o�� (�s�ԍ� + "�L��" + "����"+ "����"+ "���̕��͋C");
            System.out.println();
            System.out.println(Constant.HIT);
            System.out.println(Constant.KEY + "       " + arrc[0]);
            System.out.println(Constant.KEY_NAME + "       " + arrc[1]);
            System.out.println(Constant.DOMINANTO + "       " + arrc[2]);
            System.out.println(Constant.KEY_FEELING + " " + arrc[3]);
            System.out.println(Constant.LINE);
            // �������Ĳݸ���� srechCount
            srechCount++;
          }
        }
        //��������Ƃ��Ɉ�v���Ȃ������Ƃ�
        if (srechCount == 0) {
          System.out.println("  " + Constant.NG_HIT + " " + input);
        }
        break;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return arry_Serch_Data;
  }
}
