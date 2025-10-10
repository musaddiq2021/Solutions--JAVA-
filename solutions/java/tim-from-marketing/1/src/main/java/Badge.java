class Badge {
    public String print(Integer id, String name, String department) {
           
        String deptBadge;
        if (department == null){
            deptBadge = "OWNER";
        } else {
            deptBadge = department.toUpperCase();
        }  
        if (id == null){
            return name + " - " + deptBadge.toUpperCase();
        }else {
           return "[" + id + "] - " + name + " - " + deptBadge;
     } 
     }}