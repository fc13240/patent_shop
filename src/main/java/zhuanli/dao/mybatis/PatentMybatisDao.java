package zhuanli.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.PatentDao;
import zhuanli.dao.mapper.PatentMapper;
import zhuanli.domain.ColumnCount;
import zhuanli.domain.ContactAddress;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.GoodsDetail;
import zhuanli.domain.Notice;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.SaleGood;
import zhuanli.domain.SecondColumn;
import zhuanli.domain.User;



public class PatentMybatisDao extends SqlSessionDaoSupport implements PatentDao {
	private PatentMapper patentMapper;
	
	public void setPatentMapper(PatentMapper patentMapper) {
		this.patentMapper = patentMapper;
	}

	@Override
	public List<Patent> getSecoundColumn(int  patent_column_id) {
		return patentMapper.getSecoundColumn(patent_column_id);
	}

	@Override
	public Patent getPatentById(long patent_id) {
		return patentMapper.getPatentById(patent_id);
	}

	@Override
	public List<Patent> getSonList(int i) {
		return patentMapper.getSonList(i);
	}

	@Override
	public int getSonListCount(int j) {
		return patentMapper.getSonListCount(j);
	}

	@Override
	public List<FirstColumn> selectAllColumns() {
		return patentMapper.selectAllColumns();
	}

	@Override
	public List<Patent> getSecoundPatent(int  patent_second_column) {
		return patentMapper.getSecoundPatent(patent_second_column);
	}

	@Override
	public List<ColumnCount> getColumnCount() {
		return patentMapper.getColumnCount();
	}

	@Override
	public List<FirstColumn> selectAllPatents() {
		return patentMapper.selectAllPatents();
	}

	@Override
	public int getFirstId(int patent_second_column_id) {
		return patentMapper.getFirstId(patent_second_column_id);
	}

	@Override
	public String getCurrentTypeName(int patent_second_column_id) {
		return patentMapper.getCurrentTypeName(patent_second_column_id);
	}

	@Override
	public List<Patent> searchPatents(PatentSearchCondition patentSearchCondition) {
		return patentMapper.searchPatents(patentSearchCondition);
	}

	@Override
	public int searchPatentsCount(PatentSearchCondition patentSearchCondition) {
		return patentMapper.searchPatentsCount(patentSearchCondition);
	}

	@Override
	public List<Patent> getSecoundColumnPage(Page page) {

		return patentMapper.getSecoundColumnPage(page);
	}

	@Override
	public List<Patent> getSecoundPatentPage(Page page) {
		return patentMapper.getSecoundPatentPage(page);
	}

	@Override
	public List<Notice> getNoticeByPatentno(long patent_id) {
	
		return patentMapper.getNoticeByPatentno(patent_id);
	}

	@Override
	public Notice getNoticeById(int noticeId) {
		return patentMapper.getNoticeById(noticeId);
	}

	@Override
	public List<Patent> getAllPatents() {
		
		return patentMapper.getAllPatents();
	}

	@Override
	public List<Patent> getPatents() {
		return patentMapper.getPatents();
	}

	@Override
	public List<Patent> getPatentsByShopType(int shopType,Page page) {
		return patentMapper.getPatentsByShopType(shopType,page);
	}

	@Override
	public int getPatentsByShopTypeCount(int shopType) {
		return patentMapper.getPatentsByShopTypeCount(shopType);
	}

	@Override
	public List<GoodsDetail> getPatentByFirstColumn(int id) {
		return patentMapper.getPatentByFirstColumn(id);
	}
	public List<SaleGood> getAlreadySalePatent(Page page) {
		return patentMapper.getAlreadySalePatent(page);
	}

	@Override
	public int getAlreadySalePatentCount() {
		return patentMapper.getAlreadySalePatentCount();
	}

	@Override
	public List<SaleGood> getSearchAlreadySalePatent(PatentSearchCondition patentSearchCondition) {
		return patentMapper.getSearchAlreadySalePatent(patentSearchCondition);
	}

	@Override
	public int getSearchAlreadySalePatentCount(PatentSearchCondition patentSearchCondition) {
		return patentMapper.getSearchAlreadySalePatentCount(patentSearchCondition);
	}

	@Override
	public SaleGood getAlreadSalePatentDetail(long patentId) {
		return patentMapper.getAlreadSalePatentDetail(patentId);
	}

	@Override
	public List<GoodsDetail> selectRecommendPatents() {
		return patentMapper.selectRecommendPatents();
	}

	@Override
	public List<SaleGood> getPatentListBySecondColumnId(int secondColumnId, Page page) {
		return patentMapper.getPatentListBySecondColumnId(secondColumnId, page);
	}

	@Override
	public int getPatentListBySecondColumnIdCount(int secondColumnId) {
		return patentMapper.getPatentListBySecondColumnIdCount(secondColumnId);
	}

	@Override
	public List<SaleGood> getSearchPatentListBySecondColumnId(PatentSearchCondition patentSearchCondition) {
		return patentMapper.getSearchPatentListBySecondColumnId(patentSearchCondition);
	}

	@Override
	public int getSearchPatentListBySecondColumnIdCount(PatentSearchCondition patentSearchCondition) {
		return patentMapper.getSearchPatentListBySecondColumnIdCount(patentSearchCondition);
	}

	@Override
	public SaleGood getPatentDetailByPatentId(int patentId) {
		return patentMapper.getPatentDetailByPatentId(patentId);
	}

	@Override
	public List<GoodsDetail> getQualityGoods() {
		return patentMapper.getQualityGoods();
	}

	@Override
	public List<SaleGood> getRecommedPatents(long patentId) {
		return patentMapper.getRecommedPatents(patentId);
	}

	@Override
	public User getGoodTransferorUser(String transferor) {
		return patentMapper.getGoodTransferorUser(transferor);
	}

	@Override
	public ContactAddress getUserDefaultContactAddress(int userId) {
		return patentMapper.getUserDefaultContactAddress(userId);
	}

	@Override
	public int getSearchLotutSelfSupportPatentsCount(PatentSearchCondition patentSearchCondition) {
		return patentMapper.getSearchLotutSelfSupportPatentsCount(patentSearchCondition);
	}
	
	@Override
	public int getLotutSelfSupportPatentsCount() {
		return patentMapper.getLotutSelfSupportPatentsCount();
	}


	@Override
	public List<SaleGood> getSearchLotutSelfSupportPatents(PatentSearchCondition patentSearchCondition) {
		return patentMapper.getSearchLotutSelfSupportPatents(patentSearchCondition);
	}

	@Override
	public List<SaleGood> getLotutSelfSupportPatents(Page page) {
		return patentMapper.getLotutSelfSupportPatents(page);
	}

	@Override
	public List<SecondColumn> getSellPatentType(int firstColumn) {
		return patentMapper.getSellPatentType(firstColumn);
	}

	@Override
	public List<GoodsDetail> getSellPatentByFirstColumn(int firstColumn) {
		return patentMapper.getSellPatentByFirstColumn(firstColumn);
	}
	
	
}
