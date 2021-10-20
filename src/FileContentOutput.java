import java.io.*;

/**
 * FileContentOutput ��
 * �����ˣ�С��
 * ���ڣ�2021/10/20
 * ʱ�䣺7:22
 * �ļ����������������
 * �̳����ļ����ݸ���
 *
 */
public class FileContentOutput extends  FileContentFather{
    private String content;
    private String[] contentLists = new String[5];

    // �����̨����ļ����ݣ���������
    public void put(){
        for (String n :
                contentLists) {
            System.out.println(n);
        }
    }

    // ��ȡ����ĳһ������
    public String getOutputContent(int n){
        return contentLists[n];
    }

    public int getListsLength(){
        return contentLists.length;
    }

    public FileContentOutput(File file, String name) throws IOException {
        super(file, name);

        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((content = br.readLine()) != null){
            contentLists[i] = content;
            i++;
        }
    }
}
