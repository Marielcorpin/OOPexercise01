public class bicycle
{
		private String ownerName;
		private String tagNo;

		public bicycle() {
			ownerName = "Unknown";
			tagNo = "Unkown";
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String name){
			ownerName = name;
		}
		public void settagNo(String num){
			tagNo = num;
		}
		public  String gettagNo(){
			return tagNo;
		}
}
