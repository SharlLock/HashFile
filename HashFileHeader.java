package Hash;

public class HashFileHeader {
	int sig; //Hash文件印鉴
	int reclen; //记录长度
	int total_rec_num; //总记录数
	int current_rec_num; //当前记录数
}
