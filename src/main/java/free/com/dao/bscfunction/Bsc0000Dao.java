package free.com.dao.bscfunction;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import free.com.bean.Opinion;
import free.com.bean.bscfunction.Bsc0000ResultDto;
import free.com.bean.bscfunction.Bsc0000SearchDto;
import free.com.bean.bscfunction.Bsc0010ResultDto;
import free.com.bean.bscfunction.Bsc0010SearchDto;
import free.com.common.CommonUtil;
import free.com.common.SqlCommon;
import free.com.utils.StringUtils;

@Repository
public class Bsc0000Dao {



	public void registered(Opinion opinion){

		SqlCommon.sqlSession.save(opinion);
	}

	public List<Bsc0000ResultDto> getResult(Bsc0000SearchDto searchDto){
		String sqlStr = 
				"SELECT "
						+ "M_MID.DMP_MENU_CRT_FLG AS dmpMenuCrtFlg"
						+ ",M_MID.DMP_MENU_CRT_END_FLG AS dmpMenuCrtEndFlg"
						+ ",M_MID.DMP_MENU_CRT_PROCESS AS dmpMenuCrtProcess"
						+ ",M_MID.DMP_MENU_MEMO AS dmpMenuMemo"
						+ ",MENU.MENU_GROUP_NAME AS menuGroupName"
						+ ",MENU.MENU_NAME AS menuName"
						+ ",M_MID.MENU_MEMO AS menuMemo"
				 + " FROM T_CREATING_MENU_MID M_MID"
				 + " LEFT JOIN T_MENU MENU"
				 + " ON MENU.MENU_GROUP_ID = M_MID.MENU_GROUP_ID"
				 + " AND MENU.MENU_ID = M_MID.MENU_ID";
		SQLQuery sql = SqlCommon.sqlSession.createSQLQuery(sqlStr);
		sql.setResultTransformer(Transformers.aliasToBean(Bsc0000ResultDto.class));
		@SuppressWarnings("unchecked")
		List<Bsc0000ResultDto> list = sql.list();

		return list;
	}

	public void delete(Opinion opinion){
		SqlCommon.sqlSession.delete(opinion);
	}

	public void update(Opinion opinion){
		String sqlStr = "UPDATE t_opinion"
				+ " SET "
				+ " OPINION_CONTENT = ?,"
				+ " UPD_DATE = now(),"
				+ " UPD_USER_ID = ?"
				+ " WHERE ID = ?";
		Query sql = SqlCommon.sqlSession.createQuery(sqlStr);
		sql.setParameter(0, opinion.getOpinionContent());
		sql.setParameter(1, CommonUtil.getUserInfo().getUserId());
		sql.setParameter(2, opinion.getId());
		sql.executeUpdate();
	}
}
