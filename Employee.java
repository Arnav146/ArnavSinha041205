class Employee
{
    String name;
    float salary;
    float totalSalary;
    Employee(String n, float s)
    {
        name=n;
        salary=s;
    }
    void calc()
    {
        totalSalary= salary+ (50*salary)/100;
    }
    public static void main()
    {
        Employee obj=new Employee("Arnav", 200000f);
        System.out.println("Name of the employee: "+obj.name);
        obj.calc();
        System.out.println("Total Salary: Rs "+obj.totalSalary);
    }
}
