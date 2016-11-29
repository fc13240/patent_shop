package zhuanli.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import zhuanli.domain.Brand;
import zhuanli.domain.BrandCategory;
import zhuanli.domain.Page;

public interface BrandMapper {

	int getBrandsCountByCategory(int categoryId);

	List<Brand> getBrandsByCategory(@Param("categoryId") int categoryId,@Param("page") Page page);

	Brand getbrandDetail(int brandId);

	BrandCategory getBrandCategoryById(int categoryId);

	List<Brand> getAllBrandsByCategory(int categoryId);

	List<Brand> getRecommendBrands(int brandId);

	int getAllBrandsCount();

	List<Brand> getAllBrandsList(Page page);

	@MapKey("brandCategory.categoryId")
	Map<Integer, List<Brand>> getIndexRecommendBrands();


}
