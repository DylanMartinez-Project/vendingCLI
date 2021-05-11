<template>
  <table id="tblUsers">
    <thead>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>
          <input type="text" id="firstNameFilter" v-model="filter.firstName" />
        </td>
        <td>
          <input type="text" id="lastNameFilter" v-model="filter.lastName" />
        </td>
        <td>
          <input type="text" id="usernameFilter" v-model="filter.username" />
        </td>
        <td>
          <input type="text" id="emailFilter" v-model="filter.emailAddress" />
        </td>
        <td>
          <select id="statusFilter"  v-model="filter.status" >
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>

          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
     

      <tr v-for="skill in filteredList"
       v-bind:key="skill.id"
       v-bind:class='{disabled: skill.status === "Disabled"
}'
      >
        <td>{{ skill.firstName }}</td>
        <td>{{ skill.lastName }}</td>
        <td>{{ skill.username }}</td>
        <td>{{ skill.emailAddress }}</td>
        <td> {{ skill.status }}</td>
        



      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "user-list",
  data() {
    return {
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "",
      },
      users: [
        {
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active",
        },
        {
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active",
        },
        {
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Disabled",
        },
        {
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active",
        },
        {
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active",
        },
        {
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Disabled",
        },
      ],
    };
  },
  computed: {
    filteredList() {
      let list = this.users;
        if(this.filter.firstName != '') {
       list = list.filter((info) => info.firstName.toLowerCase().includes(this.filter.firstName.toLowerCase()))
       }if(this.filter.lastName != ''){
         list = list.filter((info) => info.lastName.toLowerCase().includes(this.filter.lastName.toLowerCase()))
       }if(this.filter.username != ''){
         list = list.filter((info) => info.username.toLowerCase().includes(this.filter.username.toLowerCase()))
       } if(this.filter.emailAddress != ''){
         list = list.filter((info) => info.emailAddress.toLowerCase().includes(this.filter.emailAddress.toLowerCase()))
       } if(this.filter.status == 'Active'){
         list = list.filter((info) => info.status.includes(this.filter.status))
       }if(this.filter.status == 'Disabled'){
         list = list.filter((info) => info.status.includes(this.filter.status))
       }
       return list;
    }
  }};
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input,
select {
  font-size: 16px;
}
</style>
