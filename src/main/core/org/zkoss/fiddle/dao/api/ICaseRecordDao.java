package org.zkoss.fiddle.dao.api;

import java.util.List;

import org.zkoss.fiddle.model.CaseRecord;
import org.zkoss.fiddle.model.CaseRecord.Type;
import org.zkoss.fiddle.model.api.ICase;

public interface ICaseRecordDao extends IDao<CaseRecord> {

	public boolean updateAmount(CaseRecord.Type type, ICase _case, Long amount);

	public boolean increase(CaseRecord.Type type, ICase _case);

	public boolean decrease(CaseRecord.Type type, Long caseId);
	
	public CaseRecord get(final Type type, final Long caseId); 

	public Long countByType(CaseRecord.Type type, boolean excludeEmpty);

	public List<CaseRecord> listByType(CaseRecord.Type type, boolean excludeEmpty, int pageIndex,
			int pageSize) ;

}
