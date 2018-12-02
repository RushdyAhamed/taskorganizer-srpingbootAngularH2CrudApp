export class Task {
    public id: number;
    public name: string;
    public dueDate: string;
    public checked: boolean;

    constructor(id: number, name: string, dueDate: string, checked: boolean){
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.checked = checked;
    }
}