import React, { useEffect, useState } from 'react';
import feedbackService from '../services/feedbackService';
import { Table, Container, Form, InputGroup } from 'react-bootstrap';

function SellerList() {
  const [sellers, setSellers] = useState([]);
  const [searchQuery, setSearchQuery] = useState('');

  useEffect(() => {
    const fetchData = async () => {
      try {
        const sellerList = await feedbackService.fetchAllSellers();
        setSellers(sellerList);
      } catch (error) {
        console.error("Failed to fetch sellers:", error);
      }
    };

    fetchData();
  }, []);

  const handleSearchChange = (event) => {
    setSearchQuery(event.target.value);
  };

  const filteredSellers = sellers.filter(seller =>
    seller.sellerName.toLowerCase().includes(searchQuery.toLowerCase())
  );

  return (
    <Container className="mt-5">
      <h2 className="mb-4">Seller List</h2>
      <InputGroup className="mb-4">
        <Form.Control
          type="text"
          placeholder="Search by seller name"
          value={searchQuery}
          onChange={handleSearchChange}
        />
      </InputGroup>
      <Table striped bordered hover>
        <thead>
          <tr>
            <th>ID</th>
            <th>Seller Name</th>
            <th>Rating</th>
            <th>Reviews</th>
          </tr>
        </thead>
        <tbody>
          {filteredSellers.map((seller) => (
            <tr key={seller.id}>
              <td>{seller.id}</td>
              <td>{seller.sellerName}</td>
              <td>{seller.rating}</td>
              <td>{seller.review}</td>
            </tr>
          ))}
        </tbody>
      </Table>
    </Container>
  );
}

export default SellerList;
