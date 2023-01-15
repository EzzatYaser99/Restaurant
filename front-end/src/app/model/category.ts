export class Category {

  id:number;
  name:string;
  date_create:Date;
  date_update:Date;

  constructor(id: number, name: string, date_create: Date, date_update: Date) {
    this.id = id;
    this.name = name;
    this.date_create = date_create;
    this.date_update = date_update;
  }
}
