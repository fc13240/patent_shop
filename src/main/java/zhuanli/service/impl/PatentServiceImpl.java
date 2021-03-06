package zhuanli.service.impl;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.util.StringUtils;

import net.lingala.zip4j.core.ZipFile;
import zhuanli.dao.PatentDao;
import zhuanli.dao.PatentSearchDao;
import zhuanli.domain.ColumnCount;
import zhuanli.domain.ContactAddress;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.GoodsDetail;
import zhuanli.domain.MongoPatent;
import zhuanli.domain.Notice;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.SaleGood;
import zhuanli.domain.SecondColumn;
import zhuanli.domain.User;
import zhuanli.service.PatentService;
import zhuanli.service.constants.Settings;
import zhuanli.service.utils.PatentFeeExcelGenerator;
import zhuanli.service.utils.ZipUtils;



public class PatentServiceImpl implements PatentService {
	private PatentDao patentDao;
	private PatentSearchDao patentSearchDao;

	
	public PatentServiceImpl(PatentDao patentDao,PatentSearchDao patentSearchDao) {
		this.patentDao = patentDao;
		this.patentSearchDao=patentSearchDao;
	}

	@Override
	public List<Patent> getSecoundColumn(int  patent_column_id) {
		return patentDao.getSecoundColumn(patent_column_id);

	}

	@Override
	public List<Patent> getPatentsByColumn(List<Patent> patent_second_columns) {
		return null;
	}
	@Override
	public Patent getPatentById(long patent_id) {
		return patentDao.getPatentById(patent_id);
	}
	@Override
	public List<Patent> getSonList(int i) {
		return patentDao.getSonList(i);
	}
	@Override
	public int getSonListCount(int j) {
		return patentDao.getSonListCount(j);
	}
	@Override
	public List<FirstColumn> selectAllColumns() {
		return patentDao.selectAllColumns();
	}
	
	@Override
	public List<Patent> getSecoundPatent(int  patent_second_column) {
		return patentDao.getSecoundPatent(patent_second_column);
	}

	@Override
	public List<ColumnCount> getColumnCount() {
		return patentDao.getColumnCount();
	}

	@Override
	public List<FirstColumn> selectAllPatents() {
		return patentDao.selectAllPatents();
	}

	@Override
	public int getFirstId(int patent_second_column_id) {
		return patentDao.getFirstId(patent_second_column_id);
	}
	@Override
	public String getCurrentTypeName(int patent_second_column_id) {
		return patentDao.getCurrentTypeName(patent_second_column_id);
	}

	@Override
	public List<Patent> searchPatents(PatentSearchCondition patentSearchCondition) {

		return patentDao.searchPatents(patentSearchCondition);
	}

	@Override
	public int searchPatentsCount(PatentSearchCondition patentSearchCondition) {

		return patentDao.searchPatentsCount(patentSearchCondition);
	}

	@Override
	public List<Patent> getSecoundColumnPage(Page page) {
		return patentDao.getSecoundColumnPage(page);
	}

	@Override
	public List<Patent> getSecoundPatentPage(Page page) {
		return patentDao.getSecoundPatentPage(page);
	}

	@Override
	public List<Notice> getNoticeByPatentno(long patent_id) {

		return patentDao.getNoticeByPatentno(patent_id);
	}

	@Override
	public Notice getNoticeById(int noticeId) {
		
		return patentDao.getNoticeById(noticeId);
	}

	@Override
	public ZipFile createNoticeZipFile(Notice notice) throws IOException {
		String tempFileName = Settings.TEMP_DIR + notice.getNoticeId() + System.currentTimeMillis() + ".zip"; 
		Path noticePath = Paths.get(Settings.NOTICE_ROOT_PATH, notice.getZipfileName(), notice.getNoticeSequence());
		ZipFile noticeZipFile = ZipUtils.zip(noticePath.toFile(), tempFileName);
		
		return noticeZipFile;
	}
	
	@Override
	public String PatentExportExcel(String excelName) throws IOException {
		List<Patent> patents = patentDao.getAllPatents();
		String exportExcelPath=Settings.TEMP_DIR+excelName;
		PatentFeeExcelGenerator.writeFeeRecordsToExcel(patents, exportExcelPath);
		return exportExcelPath;
	}

	@Override
	public List<Patent> getPatents() {
	
		return patentDao.getPatents();
	}

	@Override
	public List<Patent> getPatentsByShopType(int shopType,Page page) {
		return patentDao.getPatentsByShopType(shopType,page);
	}
	
	@Override
	public int getPatentsByShopTypeCount(int shopType) {
		return patentDao.getPatentsByShopTypeCount(shopType);
	}

	@Override
	public List<GoodsDetail> getPatentByFirstColumn(int id) {
		return patentDao.getPatentByFirstColumn(id);
	}
	
	public List<SaleGood> getAlreadySalePatent(Page page) {
		return patentDao.getAlreadySalePatent(page);
	}

	@Override
	public int getAlreadySalePatentCount() {
		return patentDao.getAlreadySalePatentCount();
	}

	@Override
	public List<SaleGood> getSearchAlreadySalePatent(PatentSearchCondition patentSearchCondition) {
		return patentDao.getSearchAlreadySalePatent(patentSearchCondition);
	}

	@Override
	public int getSearchAlreadySalePatentCount(PatentSearchCondition patentSearchCondition) {
		return patentDao.getSearchAlreadySalePatentCount(patentSearchCondition);
	}

	@Override
	public SaleGood getAlreadSalePatentDetail(long patentId) {
		return patentDao.getAlreadSalePatentDetail(patentId);
	}

	@Override
	public Map<String, List<GoodsDetail>> getIndexRecommendPatents() {
		List<GoodsDetail> patents = patentDao.selectRecommendPatents();
		Map<String, List<GoodsDetail>> recommendPatents = new HashMap<String, List<GoodsDetail>>(); 

		for(GoodsDetail patent: patents) {
			String patentFirstColumn = String.valueOf(patent.getFirstColumn());
			if (recommendPatents.containsKey(patentFirstColumn)) {
				recommendPatents.get(patentFirstColumn).add(patent);
			} else {
				List<GoodsDetail> patentList = new ArrayList<>();
				patentList.add(patent);
				recommendPatents.put(patentFirstColumn, patentList);
			}
		}
		
		return recommendPatents;
	}

	@Override
	public List<SaleGood> getPatentListBySecondColumnId(int secondColumnId, Page page) {
		return patentDao.getPatentListBySecondColumnId(secondColumnId, page);
	}

	@Override
	public int getPatentListBySecondColumnIdCount(int secondColumnId) {
		return patentDao.getPatentListBySecondColumnIdCount(secondColumnId);
	}

	@Override
	public List<SaleGood> getSearchPatentListBySecondColumnId(PatentSearchCondition patentSearchCondition) {
		return patentDao.getSearchPatentListBySecondColumnId(patentSearchCondition);
	}

	@Override
	public int getSearchPatentListBySecondColumnIdCount(PatentSearchCondition patentSearchCondition) {
		return patentDao.getSearchPatentListBySecondColumnIdCount(patentSearchCondition);
	}

	@Override
	public SaleGood getPatentDetailByPatentId(int patentId) {
		return patentDao.getPatentDetailByPatentId(patentId);
	}

	@Override
	public List<GoodsDetail> getQualityGoods() {
		return patentDao.getQualityGoods();
	}

	@Override
	public List<SaleGood> getRecommedPatents(long patentId) {
		return patentDao.getRecommedPatents(patentId);
	}

	@Override
	public User getGoodTransferorUser(String transferor) {
		return patentDao.getGoodTransferorUser(transferor);
	}

	@Override
	public ContactAddress getUserDefaultContactAddress(int userId) {
		return patentDao.getUserDefaultContactAddress(userId);
	}

	@Override
	public MongoPatent findMongoPatentByAppNo(String appNo) {
		return patentSearchDao.findMongoPatentByAppNo(appNo);
	}

	@Override
	public int getSearchLotutSelfSupportPatentsCount(PatentSearchCondition patentSearchCondition) {
		return patentDao.getSearchLotutSelfSupportPatentsCount(patentSearchCondition);
	}
	
	@Override
	public int getLotutSelfSupportPatentsCount() {
		return patentDao.getLotutSelfSupportPatentsCount();
	}

	@Override
	public List<SaleGood> getSearchLotutSelfSupportPatents(PatentSearchCondition patentSearchCondition) {
		return patentDao.getSearchLotutSelfSupportPatents(patentSearchCondition);
	}

	@Override
	public List<SaleGood> getLotutSelfSupportPatents(Page page) {
		return patentDao.getLotutSelfSupportPatents(page);
	}

	@Override
	public List<SecondColumn> getSellPatentType(int firstColumn) {
		return patentDao.getSellPatentType(firstColumn);
	}

	@Override
	public Map<String, List<GoodsDetail>> getSellPatentByFirstColumn(int firstColumn) {
		List<GoodsDetail> patents = patentDao.getSellPatentByFirstColumn(firstColumn);
		Map<String, List<GoodsDetail>> recommendPatents = new HashMap<String, List<GoodsDetail>>(); 

		for(GoodsDetail patent: patents) {
			String patentSecondColumn = String.valueOf(patent.getSecondColumn());
			if (recommendPatents.containsKey(patentSecondColumn)) {
				recommendPatents.get(patentSecondColumn).add(patent);
			} else {
				List<GoodsDetail> patentList = new ArrayList<>();
				patentList.add(patent);
				recommendPatents.put(patentSecondColumn, patentList);
			}
		}
		
		for (String key : recommendPatents.keySet()) {  
		  	if(StringUtils.isEmpty(recommendPatents.get(key))){
		  		recommendPatents.remove(key);
		  	}
	  	}
		
		return recommendPatents;
	}

}
