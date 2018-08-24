package Funding.Mapper;

import java.util.List;

import Funding.Bean.Funding;
import Funding.Bean.Reward;

public interface FundingMapper {
	
	int InsertReFunding(Funding contents);

	Reward DetailRewardList (int c_num);
}
