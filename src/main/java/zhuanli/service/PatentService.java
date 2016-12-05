package zhuanli.service;

import java.io.IOException;
import java.util.List;

import net.lingala.zip4j.core.ZipFile;
import zhuanli.domain.ColumnCount;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.Notice;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.SaleGood;


public interface PatentService {
	

	
	List<Patent> getPatentsByColumn(List<Patent> patent_second_columns);
	
	List<Patent> getSecoundColumn(int  patent_column_id);
	
	List<Patent> getSecoundColumnPage(Page  page);
	
	Patent getPatentById(long patent_id);

	List<Patent> getSonList(int i);

	int getSonListCount(int j);
	
	List<FirstColumn> selectAllColumns();



	List<Patent> getSecoundPatent(int  patent_second_column);
	
	List<Patent> getSecoundPatentPage(Page  page);

	List<ColumnCount> getColumnCount();

	List<FirstColumn> selectAllPatents();

	int getFirstId(int patent_second_column_id);

	String getCurrentTypeName(int patent_second_column_id);
	
	List<Patent> searchPatents(PatentSearchCondition patentSearchCondition);
	
	int searchPatentsCount(PatentSearchCondition patentSearchCondition);

	List<Notice> getNoticeByPatentno(long patent_id);

	Notice getNoticeById(int noticeId);
	
	ZipFile createNoticeZipFile(Notice notice) throws IOException;
	
	String PatentExportExcel(String excelName)  throws IOException;

	List<Patent> getPatents();
	
	List<Patent> getPatentsByShopType(int shopType,Page page);
	
	int getPatentsByShopTypeCount(int shopType);
	
	List<SaleGood> getAlreadySalePatent(Page page);
	
	int getAlreadySalePatentCount();
	
	List<SaleGood> getSearchAlreadySalePatent(PatentSearchCondition patentSearchCondition);
	
	int getSearchAlreadySalePatentCount(PatentSearchCondition patentSearchCondition);
	
	SaleGood getAlreadSalePatentDetail(long patentId);;
}
