import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileContentFriend ��
 * �����ˣ�С��
 * ���ڣ�2021/10/19
 * ʱ�䣺15:03
 * �ļ����ݺ�������
 * �̳����ļ����ݸ���
 * put() ���ڲ��ԣ������̨������д洢���ĺ�������
 * content �ַ�������Ҫ���ڳн��ַ�������
 * contentLists �ַ������飬���ڴ洢��������
 */
public class FileContentFriend extends FileContentFather{
    private String content = null;
    private String[] contentLists = new String[3];

    public void put(){
        for (String n : contentLists
                ) {
            System.out.println(n);
        }
    }

    public String getFriendContent(int n){
        return contentLists[n];
    }

    public int getListsLength(){
        return contentLists.length;
    }


    public FileContentFriend(File file, String name) throws IOException {
        super(file, name);

        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((content = br.readLine()) != null){
            contentLists[i] = content;
            i++;
        }
    }
}
