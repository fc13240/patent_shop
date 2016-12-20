package zhuanli.dao.imp;
import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import zhuanli.dao.PatentSearchDao;
import zhuanli.domain.MongoPatent;

public class PatentSearchDaoImpl implements PatentSearchDao{
//	private static final int DEFAULT_SLOP = 5;
//	private static final int DEFAULT_EXACT_MATCH_MIN_LENGTH = 3;
	private MongoClient mongoClient;

	public PatentSearchDaoImpl(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}
	
	@Override
	public  MongoPatent findMongoPatentByAppNo(String appNo){	
		MongoDatabase db = mongoClient.getDatabase("sopatent");
		MongoCollection<Document> collection = db.getCollection("patent");
		Document doc= collection.find(eq("appNo",appNo)).first();
		if(doc != null){
		return convertDocToMongoPatent(doc);
		}else{
			return null;
		}
	}
	
	private MongoPatent convertDocToMongoPatent(Document doc) {
		MongoPatent MongoPatent = new MongoPatent();
		MongoPatent.setId(doc.getObjectId("_id"));
		MongoPatent.setPatentAbstract(doc.getString("abstract"));
		return MongoPatent;
	}
	
	@SuppressWarnings("unchecked")
	private String array2Str(Document doc, String fieldName) {
		ArrayList<String> values = doc.get(fieldName, ArrayList.class);
		if (values != null && !values.isEmpty()) {
			return String.join(";", values);
		}
		return null;
	}
	
	private String getSubField(Document doc, String parentField, String subField) {
		Document subDoc = doc.get(parentField, Document.class);
		if (subDoc == null) {
			return null;
		}
		return subDoc.getString(subField);
	}

	
}	

  