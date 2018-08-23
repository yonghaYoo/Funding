package Funding.Mapper;

import java.util.List;

import Funding.Bean.Contents;

public interface ContentsMapper {
	
Contents DetailContents(int c_num);

List<Funding.Bean.Contents> AllListContents();

int InsertContents(Contents contents);

/*int RemDayContents(String c_dead);*/

int GoalPerContents(Contents contents);

}
//contents Mapper
