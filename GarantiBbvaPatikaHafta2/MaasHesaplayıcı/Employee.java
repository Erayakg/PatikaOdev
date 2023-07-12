package hafta1;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int vergi;
    int bonusSalary;
    int zam;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void tax() {
        if (getSalary() < 1000) {
            setSalary(getSalary());
        } else {
            int newSalary = 0;
            newSalary = getSalary() - (getSalary() * 3 / 100);
            setSalary(newSalary);
            vergi = getSalary() * 3 / 100;
        }

    }

    public void bonus() {
        bonusSalary = 0;
        if (getWorkHours() < 40) {
            setWorkHours(getWorkHours());
        } else {
            bonusSalary = (getWorkHours() - 40) * 30;
            setSalary(bonusSalary + getSalary());
        }
    }

    public void raiseSalary() {
        zam = 0;
        if (getHireYear() - 2021 < 10) {
            zam = (getSalary() * 5 / 100);
            setSalary(zam + getSalary());
        } else if (getWorkHours() > 9 && getWorkHours() < 20) {
            zam = (getSalary() * 10 / 100);
            setSalary(zam + getSalary());
        } else {
            zam = (getSalary() * 15 / 100);
            setSalary(zam + getSalary());
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "Adı ='" + name + '\'' +
                ", Maaşı =" + salary +
                ", Çalışma Saati=" + workHours +
                ", Başlangıç Yılı=" + hireYear +
                ", Vergi =" + this.vergi +
                ", Bonus =" + bonusSalary +
                ", Maaş Artışı =" + zam +
                '}';
    }
}
